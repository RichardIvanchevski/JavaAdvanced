package SetsAndMapsExercise;

import java.util.*;

public class HandsOfCards_p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map <String , Set<String>> playerHand = new LinkedHashMap<>();
        String command = scanner.nextLine();

        while(!command.equals("JOKER")){
            String [] commandSplit = command.split(":");
            String name = commandSplit[0];
            String[] cardsDraw = commandSplit[1].trim().split(", ");

            playerHand.putIfAbsent(name,new LinkedHashSet<>());
            Set <String> setCards = playerHand.get(name);
            setCards.addAll(List.of(cardsDraw));
            command = scanner.nextLine();
        }
        Map <String , Integer> calculated = calculateCards(playerHand);

        for (var players : calculated.entrySet()) {
            System.out.printf("%s: %d%n",players.getKey(),players.getValue());

        }
    }

    private static Map<String, Integer> calculateCards(Map<String, Set<String>> playerHand) {
        Map <String, Integer> calculated = new LinkedHashMap<>();

        playerHand.entrySet().forEach(e ->{
           Set <String> currentSet = e.getValue();
           int points = pointsCalculator(currentSet);
           calculated.put(e.getKey(),points);
        });
    return calculated;
    }

    private static int pointsCalculator(Set<String> currentSet) {
        int totalPoints = 0;

        for (String set : currentSet) {
            int points = 0;
          StringBuilder sb = new StringBuilder(set);
          sb.deleteCharAt(sb.length() - 1);

          try {
               points = Integer.parseInt(String.valueOf(sb));
          }catch (Exception e){
              String character = String.valueOf(set.charAt(0));
              switch (character) {
                  case "J":
                      points = 11;
                      break;
                  case "Q":
                      points = 12;
                      break;
                  case "K":
                      points = 13;
                      break;
                  case "A":
                      points = 14;
                      break;
              }
          }
          String lastCar = String.valueOf(set.charAt(set.toCharArray().length - 1));
            switch (lastCar) {
                case "S":
                    points *= 4;
                    break;
                case "H":
                    points *= 3;
                    break;
                case "D":
                    points *= 2;
                    break;
                case "C":
                    points *= 1;
                    break;
            }

          totalPoints += points;
        }

        return totalPoints;
    }
}
