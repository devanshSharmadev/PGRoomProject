package com.pgroomapp.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class PGBranch {
    @Id
    private Integer branchNumber;
    private String branchName;
    private Integer numberOfRooms;
    private BranchLocation branchLocation;
}
