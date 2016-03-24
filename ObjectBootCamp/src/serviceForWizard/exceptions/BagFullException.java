package serviceForWizard.exceptions;
/*
    Job :-
        
*/

public class BagFullException extends Exception {
        public BagFullException() {
            super("Can't add more balls");
        }
}
