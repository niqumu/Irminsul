package io.irminsul.game.net.packet;

import io.irminsul.common.game.mail.Mail;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetAllMailResultNotifyOuterClass;
import io.irminsul.common.proto.MailDataOuterClass;
import io.irminsul.common.proto.MailTextContentOuterClass;
import io.irminsul.game.net.OutboundPacket;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PacketGetAllMailResultNotify extends OutboundPacket {
    public PacketGetAllMailResultNotify(Session session, @NotNull List<Mail> mailList) {
        super(PacketIds.GetAllMailResultNotify, session);

        GetAllMailResultNotifyOuterClass.GetAllMailResultNotify.Builder builder =
            GetAllMailResultNotifyOuterClass.GetAllMailResultNotify.newBuilder()
                .setPacketNum(1)
                .setPacketBeSentNum(1);

        for (Mail mail : mailList) {
            builder.addMailList(
                MailDataOuterClass.MailData.newBuilder()
                    .setMailId(mail.getId())
                    .setMailTextContent(
                        MailTextContentOuterClass.MailTextContent.newBuilder()
                            .setTitle(mail.getTitle())
                            .setSender(mail.getSender())
                            .setContent(mail.getContent())
                            .build()
                    )
                    .setSendTime(mail.getSendTime())
                    .setExpireTime(mail.getExpireTime())
                    .build()
            );
        }

        this.setData(builder.build().toByteArray());
    }
}
