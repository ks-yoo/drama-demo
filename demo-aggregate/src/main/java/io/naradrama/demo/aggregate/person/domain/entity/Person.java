package io.naradrama.demo.aggregate.person.domain.entity;

import io.naradrama.demo.aggregate.person.domain.entity.sdo.PersonCdo;
import io.naradrama.prologue.domain.NameValue;
import io.naradrama.prologue.domain.NameValueList;
import io.naradrama.prologue.domain.ddd.DomainAggregate;
import io.naradrama.prologue.domain.ddd.DomainEntity;
import io.naradrama.prologue.util.json.JsonUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person extends DomainEntity implements DomainAggregate {
    //
    private String name;
    private int age;

    public Person(String id) {
        super(id);
    }

    public Person(PersonCdo personCdo) {
        super();
        BeanUtils.copyProperties(personCdo, this);
    }

    public void modifyValues(NameValueList nameValues) {
        for (NameValue nameValue : nameValues.list()) {
            String value = nameValue.getValue();
            switch(nameValue.getName()) {
                case "name":
                    this.name = value;
                    break;
                case "age":
                    this.age = Integer.valueOf(value);
                    break;
                default:
                    throw new IllegalArgumentException("Update not allowed: " + nameValue);
            }
        }
    }

    public String toString() {
        return toJson();
    }

    public static Person fromJson(String json) {
        return JsonUtil.fromJson(json, Person.class);
    }

    public static Person sample(){
        return null;
    }

}
