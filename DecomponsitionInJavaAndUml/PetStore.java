import java.util.ArrayList;

public class PetStore {
    
    private ArrayList<Pet> pets;

    public PetStore() {
        pets = new ArrayList<Pet>();
    }

    public void add(Pet pet) {
        pets.add(pet);
    }

}
