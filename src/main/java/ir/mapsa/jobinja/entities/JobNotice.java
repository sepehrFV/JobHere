package ir.mapsa.jobinja.entities;

import ir.mapsa.jobinja.enums.JobEngagementType;
import ir.mapsa.jobinja.enums.NoticeStatus;
import ir.mapsa.jobinja.enums.Skills;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class JobNotice extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "notice_Id")
    private Long id;

    @Column(name = "notice_title")
    private String title;

    @Enumerated(value = EnumType.STRING)
    private Skills skill;

    @Column(name = "salary_amount")
    private Double salaryAmount;

    @Enumerated(value = EnumType.STRING)
    private JobEngagementType engagementType;

    @Column(name = "notice_explanation")
    private String fullExplanation;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "time_left")
    private Date timeLeft;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employer_ID")
    private Employer employer;

    @Enumerated(value = EnumType.STRING)
    private NoticeStatus noticeStatus;


}
