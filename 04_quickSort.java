import java.util.Arrays;

// 4. Quick sort - Bora
public class QucickTest {
	public static void main(String[] args) {
		int[] array = { 7, 6, 8, 1, 2, 3, 5, 5, 4 };
		quickSort(array, 0, array.length - 1);
		System.out.println("result = " + Arrays.toString(array));
	}

	public static void quickSort(int[] arr, int start, int end) {
		if (start >= end) { // 검사할 범위가 1일땐 정렬 완료
			return;
		}

		int pivot = start;
		int temp, i, j;
		do {
			i = start + 1; // i++ (pivot 제외 = +1)
			j = end; // j--
			
			// --> 방향으로 피벗값보다 큰값 찾을때 까지
			while (arr[i] < arr[pivot]) {
				i++;
				if (i >= end) { 
					i = pivot;
				}				
			}

			// <-- 방향으로 피벗값보다 작은 값 찾을때 까지
			while (arr[j] > arr[pivot]) {
				j--;
				if (j <= start) {
					j = pivot;
				}
			}

			if (i < j) {
				// 안 엇갈림 = 자리 바꿈
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			} else {
				// 엇갈릴 때
				if (j != pivot) {
					temp = arr[j];
					arr[j] = arr[pivot];
					arr[pivot] = temp;
				}
			}

		} while (i < j); // 안엇갈렸다면 계속 반복
		
		//엇갈린 경우 바뀐 피벗값 기준으로 정렬 필요
		quickSort(arr, start, j - 1);
		quickSort(arr, j + 1, end);
	}
}