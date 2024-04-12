package com.expensecal.expensecal.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.Date;

//@Data // Generates getters, setters, toString, equals, and hashCode methods
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExpenseDTO {
    @NotEmpty(message = "Person ID cannot be empty")
    @JsonProperty("person_id")
    private String personId;

    @NotEmpty(message = "Group ID cannot be empty")
    @JsonProperty("group_id")
    private String groupId;

    @NotNull(message = "Date of entry cannot be null")
    @JsonFormat(pattern = "dd-MMM-yyyy")
    @JsonProperty("date_of_entry")
    private Date dateOfEntry;

    @NotNull(message = "Expense price cannot be null")
    @Positive(message = "Expense price must be positive")
    @JsonProperty("expense_price")
    private  String expensePrice; // Changed to BigDecimal for monetary value

    @NotBlank(message = "Expense description cannot be blank")
    @JsonProperty("expense_description")
    private String expenseDescription;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Date getDateOfEntry() {
        return dateOfEntry;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }

    public void setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
    }

    public String getExpensePrice() {
        return expensePrice;
    }

    public void setExpensePrice(String expensePrice) {
        this.expensePrice = expensePrice;
    }

    public void setDateOfEntry(Date dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }



    // No need for explicit constructors, getters, or setters
}
