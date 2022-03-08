package ir.mapsa.jobinja.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Data
@Audited
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReservedList extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reservedList_id")
    private Long Id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "jobSeeker_id")
    private JobSeeker jobSeeker;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "notice_Id")
    private JobNotice jobNotice;


}
