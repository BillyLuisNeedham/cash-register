import main.kotlin.functions.calculatePrice
import main.kotlin.models.Item
import main.kotlin.models.ItemName
import main.kotlin.models.ItemQuantity
import main.kotlin.models.Offer
import main.kotlin.models.PriceInPounds
import main.kotlin.models.Promotion

// TODO Needs to:
//- Take a list of items {name: ItemName, price: PriceInPounds}
//- Needs to take a list of promotions
//  - Promotions are an item name and the offer which will be something along the lines of 3x2
//- Calculates the total price

fun main(args: Array<String>) {
    println("Hello World!")

    val items = listOf(
        Item(
            name = ItemName("apple"),
            price = PriceInPounds(0.65)
        )
    )
    val promotions = listOf(
        Promotion(
            item = ItemName("apple"),
            offer = Offer(
                originalAmount = ItemQuantity(1),
                offerAmount = ItemQuantity(2)
            )
        )
    )

    val price: PriceInPounds = calculatePrice(
        items = items,
        promotions = promotions
    )
}
