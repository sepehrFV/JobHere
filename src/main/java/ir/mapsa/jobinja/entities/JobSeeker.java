package ir.mapsa.jobinja.entities;

import ir.mapsa.jobinja.enums.Gender;
import ir.mapsa.jobinja.enums.Skills;
import ir.mapsa.jobinja.enums.MilitaryStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class JobSeeker extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "jobSeeker_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "family")
    private String family;

    @Column(name = "age")
    private Integer age;

    @Column(name = "nationalCode")
    private String nationalCode;

    /*@Enumerated(value = EnumType.STRING)
    @Column(columnDefinition = "MALE")
    private Gender gender;*/

    @Column(name = "address")
    private String address;

    @Column(name = "married",columnDefinition = "false")
    private boolean married;

    @Enumerated(value = EnumType.STRING)
    private Skills mainSkill;

    @Enumerated(value = EnumType.STRING)
    @Column(columnDefinition = "UNLIABLE")
    private MilitaryStatus militaryStatus;

    @Column(name = "cv_driveAddress")
    private String cv;


}
