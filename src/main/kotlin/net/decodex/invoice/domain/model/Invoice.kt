package net.decodex.invoice.domain.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*
import javax.persistence.*

@Entity(name = "invoice_table")
@EntityListeners(AuditingEntityListener::class)
data class Invoice(
    var number: Int,

    var name: String,

    var dateCreated: Date,

    var dateOfTraffic: Date,

    var paymentDue: Date,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    var company: Company,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    var client: Client,

    @OneToMany(mappedBy = "invoice", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var productPrices: MutableList<ProductPrice> = arrayListOf(),

    var sum: Double = 0.0,

    var payedAmount: Double = 0.0,

    var remainingAmount: Double = 0.0,

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