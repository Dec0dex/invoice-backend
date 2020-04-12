package net.decodex.invoice.domain.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*
import javax.persistence.*

@Entity(name = "product_price_table")
@EntityListeners(AuditingEntityListener::class)
data class ProductPrice(

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    var product: Product,

    var price: Double,

    var discount: Int? = 0,

    var quantity: Int? = 0,

    var number: Int? = 0,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "invoice_id")
    var invoice: Invoice? = null,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    var client: Client? = null,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    val createdAt: Date = Date(),

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    @LastModifiedDate
    var updatedAt: Date = Date()
)