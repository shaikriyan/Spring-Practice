package Practice;


import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@NoArgsConstructor
public class Chef {

    @Autowired
    @Qualifier("ingredients1")
    private Ingredients ingredients;



    public Chef(Ingredients ingredients) {
        System.out.println("Chef.Chef constr");
        this.ingredients = ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        System.out.println("Chef.setIngredients setter.");
        this.ingredients = ingredients;
    }

    public void cooking() {
//        if(ingredients!=null){
            ingredients.getIngredients();
            System.out.println("Cooking is done, you can start with your meal");
//        }else{
//            System.out.println("No ingredients/ out of service");
//        }
    }


}
