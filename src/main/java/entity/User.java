package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    //userid
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long userid;
    //userName
    //password


}
