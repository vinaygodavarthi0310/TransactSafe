package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alert {

    //alertId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long alertId;
    //alertMessage
    @Column
    private String alertMessage;
    //alertDate
    @Column
    private LocalDateTime alertDate;


}
