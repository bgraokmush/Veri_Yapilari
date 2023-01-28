package Hafta9_Graph.Ornek04;
import java.util.List;
/**
 *
 * @author bugra
 */
public class Ornek04 {
    
    public static int findMax(List<List<Integer>> grid, boolean[][] visited, int row, int column) {
         int count = 0;
         
         //Verilen matrisin sınırları dışında arama yapmamak için durma şartı
         if(row < 0 || row>=grid.size() || column < 0 || column>=grid.get(0).size()){
             return count;
         }
         //Eğer gezildiyse durma şartı
         if(visited[row][column]){
             return count;
         }
         //Gezilmediyse önce gezildi verisini tutalım
         visited[row][column] = true;
         
         //Gezilecek yerler eğer sıfır ise gitme
         if(grid.get(row).get(column) == 0){
             return count;
         }
         count++;
         count += findMax(grid, visited, row, column+1);
         count += findMax(grid, visited, row, column-1);
         count += findMax(grid, visited, row-1, column);
         count += findMax(grid, visited, row-1, column-1);
         count += findMax(grid, visited, row-1, column+1);
         count += findMax(grid, visited, row+1, column);
         count += findMax(grid, visited, row+1, column+1);
         count += findMax(grid, visited, row+1, column-1); 
         
         return count;
    }
    
    public static int maxRegion(List<List<Integer>> grid){
        int row = grid.size(); 
        int column = grid.get(0).size();
        //Daha önce gezip gezmediğimi kontrol etmek için verilen
        //liste ile aynı boyutlarda matris oluşturuyorum
        boolean[][] visited = new boolean[row][column];
        int max = 0;
        int result;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                //verilen i ve j değerlerinden itibaren gezilmeye başlanacak
                result = findMax(grid, visited, i, j);
                if(result >max){
                    max = result;
                }
            }
        }
        return max;
    }
}
