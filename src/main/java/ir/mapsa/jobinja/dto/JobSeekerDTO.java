package ir.mapsa.jobinja.dto;

import ir.mapsa.jobinja.enums.Gender;
import ir.mapsa.jobinja.enums.Skills;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerDTO {


    private Long id;

    @NotNull
    @Size(min = 2,max = 15)
    private String name;
    @NotNull
    @Size(min = 2,max = 15)
    private String family;
    @NotNull
    private Skills mainSkill;
    private boolean married;
    @Min(18)
    private Integer age;
    //private Gender gender;
    private String cv;


}
