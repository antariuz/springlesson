package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@NoArgsConstructor @ToString @Setter @Getter @Component
public class Car {

    private String model = "BMW-666";

}
