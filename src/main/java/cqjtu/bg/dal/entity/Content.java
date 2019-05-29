package cqjtu.bg.dal.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@ToString
@Data
@Entity
@Table(name="bg_content")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contentId;
//    表白的文字内容
    private String text;
    private Date releaseDate;
    private String username;//表白人是谁
    private String imageUrl;
}
