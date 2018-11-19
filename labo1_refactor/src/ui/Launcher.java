package ui;

import javax.swing.*;
import domain.*;

import static java.lang.Integer.parseInt;

public class Launcher {
    public static void main(String[] args) {
        Shop shop = new Shop();

        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = parseInt(choiceString);
            if (choice == 1) {
                String title = JOptionPane.showInputDialog("Enter the title:");
                String id = JOptionPane.showInputDialog("Enter the id:");

                String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
                if (type == "M" || type == "movie") {
                    Movie movie = new Movie(id, title, type);
                    shop.addProduct(movie);
                } else {
                    Game game = new Game(id, title, type);
                    shop.addProduct(game);
                }

            } else if (choice == 2) {
                String id = JOptionPane.showInputDialog("Enter the id:");
                int idx = -1;
                boolean found = false;
                for(int i = 0; i < shop.productIds.size() && !found; i++)
                {
                    if(shop.productIds.get(i).equals(id))
                    {
                        idx = i;
                        found = true;
                    }
                }
                if(found)
                {
                    JOptionPane.showMessageDialog(null, shop.productTitles.get(idx));
                }
                shop.showProduct(shop);
            } else if (choice == 3){
                shop.showPrice(shop);
            }
        }
    }
}
