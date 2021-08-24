import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BusTest<BusStop> {

    Bus bus;
    Person person;


    @Before
    public void setUp() {
        bus = new Bus("Train Station", 2);
        person = new Person();

    }

    @Test
    public void passengerCountStartsAt0() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengers() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertFalse(bus.getPassengers().contains(person));
        assertEquals(0, bus.passengerCount());
    }

}




