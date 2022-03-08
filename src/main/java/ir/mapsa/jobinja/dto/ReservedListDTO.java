package ir.mapsa.jobinja.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservedListDTO {

    private Long id;
    private JobSeekerDTO jobSeekerDTO;
    private JobNoticeDTO jobNoticeDTO;
}
