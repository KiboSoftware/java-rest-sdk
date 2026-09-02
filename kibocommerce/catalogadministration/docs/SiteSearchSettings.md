

# SiteSearchSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**crossFieldAdditiveScoreFactor** | **Double** |  |  [optional] |
|**customBoosts** | **List&lt;String&gt;** |  |  [optional] |
|**fieldValueBoost** | [**FieldValueBoost**](FieldValueBoost.md) |  |  [optional] |
|**fieldWeights** | [**List&lt;SiteSearchFieldWeight&gt;**](SiteSearchFieldWeight.md) |  |  [optional] |
|**minimumMatchPercents** | **List&lt;Integer&gt;** |  |  [optional] |
|**multiTermSynMinimumMatchPercents** | **List&lt;Integer&gt;** | if values present is used for mm when sowBehavior.WhenNoMultiTermSyn and multi term sym match found in query if no values are present or null fallback to MinMatchPercents |  [optional] |
|**personalizationExperience** | **String** |  |  [optional] |
|**personalizationFactor** | **Double** |  |  [optional] |
|**phraseSlop** | **Integer** |  |  [optional] |
|**searchChildProductsByDefault** | **Boolean** |  |  [optional] |
|**searchMode** | **Integer** |  |  [optional] |
|**sowBehavior** | **Integer** | controls sowBehavior (Never&#x3D;0, Always&#x3D;1, WhenNoMultiTermSyn&#x3D;2) never sow&#x3D;false, always sow&#x3D;true,  WhenNoMultiTermSyn &#x3D; (depends on existance of multitermsynonym match in query) |  [optional] |
|**spellcheck** | [**CatalogAdminsSpellcheck**](CatalogAdminsSpellcheck.md) |  |  [optional] |
|**twoWordPhraseBoost** | **Boolean** | if true, 2 word shingles used for phrase boosting based on fields with phrase weights greater than 0 if false, only full phrase mathing used for phrase boosting |  [optional] |
|**typoTolerance** | [**TypoTolerance**](TypoTolerance.md) |  |  [optional] |
|**vectorSettings** | [**VectorSearchSettings**](VectorSearchSettings.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


