package chance;

public class Chance {
    private final int totalPossibleOutcomes;
    private final int numberOfCoins;

    public Chance(int totalPossibleOutcomes, int numberOfCoins) {
        this.totalPossibleOutcomes = totalPossibleOutcomes;
        this.numberOfCoins = numberOfCoins;
    }

    public double getProbabilityOfTail() {
        double probability = 1d / totalPossibleOutcomes;
        for(int i = 0; i < numberOfCoins-1; i++){
            probability *= 1d / totalPossibleOutcomes;
        }
        return probability;
    }

    public double getProbabilityOfAtleastOneTail(){
        double probability = 1-(1d / totalPossibleOutcomes);
        for(int i = 0; i < numberOfCoins-1; i++){
            probability *= 1-(1d / totalPossibleOutcomes);
        }
        return 1 - (probability);
    }

    public double getProbabilityOfNotTail() {
        return 1 - getProbabilityOfTail();
    }
//
//    public double getProbabilityOfTailForACoin(){
//        return 1d / totalPossibleOutcomes;
//    }
//
//    public double getProbabilityOfHeadForACoin(){
//        return 1d / totalPossibleOutcomes;
//    }
}
