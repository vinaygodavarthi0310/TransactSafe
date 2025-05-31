package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    //transId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long transId;
    //transAmount
    @Column
    private Double transAmount;
    //date
    @Column
    private LocalDate date;
    //status
    @Column
    private String status;
}
