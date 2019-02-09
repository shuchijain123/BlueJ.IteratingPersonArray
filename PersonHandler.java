 

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // assume there is a `counter`
        int i =0;
        // while `counter` is less than length of array
        while (i<personArray.length)
        
            // begin loop
            {

                // use `counter` to identify the `current Person` in the array
                String currentperson = (personArray[i]).toString();
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
result= result +currentperson;
i++;
}
            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        int i=0;
        // identify terminal condition
        
        // identify increment
        
        

        // use the above clauses to declare for-loop signature
        for (i=0;i<personArray.length;i++)
            // begin loop
            {
                // use `counter` to identify the `current Person` in the array
                String currentperson = (personArray[i]).toString();
                
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
                result= result+currentperson;
            // end loop
        }

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
            for (Person currentperson : personArray){
            
                // get `string Representation` of `currentPerson`
                result = result+(currentperson).toString();
            }
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
