

# WishlistAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerAccountId** | **Integer** | Unique identifier of the customer account. |  [optional] |
|**externalId** | **String** | Id in an external system this item may have been imported from |  [optional] |
|**importDate** | **OffsetDateTime** | Date this item was imported |  [optional] |
|**isImport** | **Boolean** | Was this object imported from an external system? |  [optional] |
|**items** | [**List&lt;WishlistItem&gt;**](WishlistItem.md) | List of items in the wishlist. |  [optional] |
|**name** | **String** | Name of the list that is display or potentially shared (e.g. friends and family may view this description if the list is public and the list owner may see this description when viewing the list) |  [optional] |
|**privacyType** | **String** | Is the wishlist public, viewable only through a shared link, or private (only the owner of the list may view the wishlist)? |  [optional] |
|**sortOrder** | **Integer** | The wishlist sort order.  Useful for scenarios where there is a default wishlist and other wishlists or arbitrary ordering |  [optional] |
|**typeTag** | **String** | Open-ended Wishlist type, e.g. giftlist, gift, wish, wishlist, wedding, baby.  If the merchant does not need this level of granularity this is always null. |  [optional] |
|**version** | **String** | Version for concurrency purposes |  [optional] |


## Implemented Interfaces

* Serializable


