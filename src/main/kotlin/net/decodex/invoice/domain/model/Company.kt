package net.decodex.invoice.domain.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*
import javax.persistence.*

@Entity(name = "company_table")
@EntityListeners(AuditingEntityListener::class)
data class Company(
    var name: String,
    var address: String,
    var postalCode: String,
    var city: String,

    @Column(unique = true)
    var pib: String,

    @Column(unique = true)
    var accountNumber: String,

    var phoneNumber: String? = null,
    var email: String? = null,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @OneToMany(mappedBy = "company", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var employes: MutableList<User> = arrayListOf(),

    @OneToMany(mappedBy = "company", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var unitOfMeasures: MutableList<UnitOfMeasure> = arrayListOf(),

    @OneToMany(mappedBy = "company", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var clients: MutableList<Client> = arrayListOf(),

    @OneToMany(mappedBy = "company", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var invoices: MutableList<Invoice> = arrayListOf(),

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    val createdAt: Date = Date(),

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    @LastModifiedDate
    var updatedAt: Date = Date()
)