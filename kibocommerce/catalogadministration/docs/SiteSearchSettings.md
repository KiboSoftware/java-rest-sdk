

# SiteSearchSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sowBehavior** | **Integer** | controls sowBehavior (Never&#x3D;0, Always&#x3D;1, WhenNoMultiTermSyn&#x3D;2)  never sow&#x3D;false, always sow&#x3D;true,  WhenNoMultiTermSyn &#x3D; (depends on existance of multitermsynonym match in query) |  [optional] |
|**fieldWeights** | [**List&lt;SiteSearchFieldWeight&gt;**](SiteSearchFieldWeight.md) |  |  [optional] |
|**customBoosts** | **List&lt;String&gt;** |  |  [optional] |
|**fieldValueBoost** | [**FieldValueBoost**](FieldValueBoost.md) |  |  [optional] |
|**multiTermSynMinimumMatchPercents** | **List&lt;Integer&gt;** | if values present is used for mm when sowBehavior.WhenNoMultiTermSyn and multi term sym match found in query  if no values are present or null fallback to MinMatchPercents |  [optional] |
|**minimumMatchPercents** | **List&lt;Integer&gt;** |  |  [optional] |
|**phraseSlop** | **Integer** |  |  [optional] |
|**twoWordPhraseBoost** | **Boolean** | if true, 2 word shingles used for phrase boosting based on fields with phrase weights greater than 0  if false, only full phrase mathing used for phrase boosting |  [optional] |
|**personalizationExperience** | **String** |  |  [optional] |
|**personalizationFactor** | **Double** |  |  [optional] |
|**searchChildProductsByDefault** | **Boolean** |  |  [optional] |
|**crossFieldAdditiveScoreFactor** | **Double** |  |  [optional] |
|**typoTolerance** | [**TypoTolerance**](TypoTolerance.md) |  |  [optional] |
|**spellcheck** | [**CatalogAdminsSpellcheck**](CatalogAdminsSpellcheck.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


