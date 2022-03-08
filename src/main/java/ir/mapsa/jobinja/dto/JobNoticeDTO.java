package ir.mapsa.jobinja.dto;

import ir.mapsa.jobinja.entities.Employer;
import ir.mapsa.jobinja.enums.Skills;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobNoticeDTO {

    private Long id;
    @NotNull
    @Size(min =5,max = 20)
    private String title;
    @Min(100)
    private Double salaryAmount;
    @Max(1000)
    private String fullExplanation;
    @NotNull
    private Skills skill;


}
