package io.naradrama.demo.aggregate.person.domain.entity.sdo;

import io.naradrama.prologue.util.json.JsonSerializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import io.naradrama.prologue.util.json.JsonUtil;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonCdo implements JsonSerializable {
    //
    private String name;

    public String toString() {
        return toJson();
    }

    public static PersonCdo fromJson(String json) {
        return JsonUtil.fromJson(json, PersonCdo.class);
    }


}
