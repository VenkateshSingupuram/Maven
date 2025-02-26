package SetterBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
private String city;
private String state;

public String getCity() {
	return city;
}
@Value("Hyderabad")
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
@Value("Telangana")
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}

}
