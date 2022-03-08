package ir.mapsa.jobinja.entities;

import ir.mapsa.jobinja.enums.CompanyType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Employer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employer_ID",unique = true)
    private Long id;

    @Column(name = "companyName")
    private String companyName;

    @Enumerated(value = EnumType.STRING)
    @Column(columnDefinition = "ONE_PERSON")
    private CompanyType companyType;

    @Column(name = "employerAddress")
    private String address;


}
