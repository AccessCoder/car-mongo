package com.example.carmongo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Document gibt uns die Möglichkeit die Collection zu benennen, ausserdem zeigt sie uns an, welche Felder ID und Values sind
@Document("Cars")
public class Car {

    private String id; //links am Rand zeigt er einen Schlüssel an, da der Name "id" erkannt wird, sollte ein Feld welches nicht id heißt die id werden müssen, so gibt es die Annotation @ID dafür
    private String brand;
    private String model;
    private int year;
}
