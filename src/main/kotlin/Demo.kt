import net.datafaker.Faker

fun main(args: Array<String>) {
    val bloomFilter = BloomFilter(1000, 3)

    bloomFilter.add("Hello".toByteArray())
    repeat(999) {
        bloomFilter.add(Faker().name().firstName().toByteArray())
    }

    val mightContains = bloomFilter.mightContains("Hello".toByteArray())
    println(if (mightContains) "Might contains" else "Doesn't contain")
}