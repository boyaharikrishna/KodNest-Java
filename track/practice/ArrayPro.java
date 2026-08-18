public class ArrayPro {
    public static void main(String[] args) {
        // Required data variables
        int[] original = {14, 18, 22, 26};
        int updateIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        // 1. Create independent snapshot array and copy values manually using a loop
        int[] snapshot = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        // 2. Create live view alias pointing to original
        int[] liveView = original;

        // 3. Update element through liveView if index is valid
        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updatedValue;
        }

        // 4. Print Original array
        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + (i == original.length - 1 ? "" : " "));
        }
        System.out.println();

        // 5. Print Snapshot array
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + (i == snapshot.length - 1 ? "" : " "));
        }
        System.out.println();

        // 6. Print reference comparison
        System.out.println("Same object: " + (liveView == original));

        // 7. Validate requestedIndex before accessing
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}