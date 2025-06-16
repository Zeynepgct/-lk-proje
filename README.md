*Java Array Count Examples*
Bu proje Java'da bir dizide 20'den büyük kaç eleman var birkaç yöntemle saymayı gösterir.

🟣 Proje Açıklaması
9 integer değerini kullanıcıdan alır.

Bu dizide 20'den büyük kaç eleman var; 4 ayrı yaklaşımla sayar.

🟣 Yöntemler
✅ Arrays.stream()

long count = Arrays.stream(numbers).filter(num -> num > 19).count();

✅ Arrays.copyOf() ve manuel sayma

int[] copied = Arrays.copyOf(numbers, numbers.length);
int count = 0;
for (int num : copied) {
    if (num > 19) count++;
}
✅ Arrays.parallelSort() ve Arrays.binarySearch()

Arrays.parallelSort(numbers);
int index = Arrays.binarySearch(numbers, 20);
if (index < 0) index = -index - 1;
int count = numbers.length - index;
✅ Manual sayma

int count = 0;
for (int num : numbers) {
    if (num > 19) count++;
}
🟣 Örnek çıktı

Please enter 9 integers:
1 20 30 40 50 10 5 25 35

Count using Arrays.stream(): 6
Count using Arrays.copyOf(): 6
Count using Arrays.parallelSort() and binary search: 6
Count using manual counting: 6
