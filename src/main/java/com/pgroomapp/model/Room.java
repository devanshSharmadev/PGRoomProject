package com.pgroomapp.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "newroom")
public class Room {

    @Id
    private int roomNumber;
    @DBRef
    private List<RoomMember> roomMembers;
    private int roomSharingType;
    private double rentPerPerson;
    private Boolean wifi;
    private Boolean balcony;
    @Field(targetType = FieldType.STRING)
    private WallColor wallColor;
    private Boolean roomCleaningService;
    @DBRef
    private PGBranch pgBranch;

}
