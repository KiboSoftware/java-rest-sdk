

# AttributeSearchSettings

Attribute Search Settings. A container for all of the search and indexing settings of an Attribute

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**searchableInStorefront** | **Boolean** | Indicates whether the attribute value should be searchable on the public storefront. |  [optional] |
|**searchableInAdmin** | **Boolean** | Indicates whether the attribute value should be searchable in the merchant catalog admin. |  [optional] |
|**searchDisplayValue** | **Boolean** | If true, the system will index the display value of string attributes instead of the canonical value for searching.   The canonical value will always be used for filtering. Does not apply for for non-string attributes. |  [optional] |
|**allowFilteringAndSortingInStorefront** | **Boolean** | Indicates whether the attribute should be able to be used in filters, facets, and sorting on the public storefront. |  [optional] |
|**indexValueWithCase** | **Boolean** | Indicates whether the attribute value is case sensative for filtering and faceting. This applies to Text Admin entered attributes.   A null value means it is not case sensative |  [optional] |
|**customWeightInStorefrontSearch** | **Boolean** | Indicates whether the attribute is indevidually stored as a tokenized field in search for custom term search weight |  [optional] |


## Implemented Interfaces

* Serializable


