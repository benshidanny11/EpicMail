package cc.zoyn.epicmail.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

import java.util.List;
import java.util.UUID;

/**
 * @author Zoyn
 * @since 2018-05-20
 */
@Data
@Table("epicmail_mailbox")
@NoArgsConstructor
@AllArgsConstructor
public class MailBox extends Model {

    private UUID uuid;
    private String owner;
    private List<Mail> mails;

}
