package io.irminsul.game.net.packet;

import io.irminsul.common.game.mail.Mail;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.MailChangeNotifyOuterClass;
import io.irminsul.common.proto.MailDataOuterClass;
import io.irminsul.common.proto.MailTextContentOuterClass;
import io.irminsul.game.net.OutboundPacket;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PacketMailChangeNotify extends OutboundPacket {
    public PacketMailChangeNotify(@NotNull Session session, @NotNull Mail mail) {
        this(session, List.of(mail), List.of());
    }

    public PacketMailChangeNotify(@NotNull Session session, @NotNull List<Mail> addList, @NotNull List<Integer> removeList) {
        super(PacketIds.MailChangeNotify, session);

        MailChangeNotifyOuterClass.MailChangeNotify.Builder builder =
            MailChangeNotifyOuterClass.MailChangeNotify.newBuilder();

        // New mail
        for (Mail mail : addList) {
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

        // Mail for removal
        builder.addAllDelMailIdList(removeList);

        // Done
        this.setData(builder.build().toByteArray());
    }
}
