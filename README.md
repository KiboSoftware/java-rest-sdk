# Kibo Commerce Java SDK

## Introduction

This repository is home to the Kibo Commerce Java SDK modules generated from Kibo Commerce API documentation.

## Installation

### Maven

```xml
<properties>
    <kibocommerce.version>2.0.0-SNAPSHOT</kibocommerce.version>
</properties>
<dependencies>
    <dependency>
      <groupId>com.kibocommerce</groupId>
      <artifactId>catalogadministration</artifactId>
      <version>${kibocommerce.version}</version>
    </dependency>
    <!-- ...other Kibo Service Modules -->
<dependencies>
```

### Modules

There are modules for each micro-service.

- `com.kibocommerce.adminuser`
- `com.kibocommerce.appdevelopment`
- `com.kibocommerce.catalogadministration`
- `com.kibocommerce.catalogstorefront`
- `com.kibocommerce.commerce`
- `com.kibocommerce.common`
- `com.kibocommerce.content`
- `com.kibocommerce.customer`
- `com.kibocommerce.entities`
- `com.kibocommerce.event`
- `com.kibocommerce.fulfillment`
- `com.kibocommerce.importexport`
- `com.kibocommerce.inventory`
- `com.kibocommerce.locationadmin`
- `com.kibocommerce.locationstorefront`
- `com.kibocommerce.orderrouting`
- `com.kibocommerce.pricingstorefront`
- `com.kibocommerce.reference`
- `com.kibocommerce.reservation`
- `com.kibocommerce.settings`
- `com.kibocommerce.shippingadmin`
- `com.kibocommerce.shippingstorefront`
- `com.kibocommerce.solrschemamanager`
- `com.kibocommerce.subscription`

## Usage

- Create a KiboConfiguration instance and configure with your credentials and tenant details:

  - TenantID
  - SiteID (optional)
  - ClientID
  - ClientSecret
  - TenantHost
  - HomeHost (home.mozu.com)

- Create an API Client instance using the KiboConfiguration instance
- Make API calls!

### Configuration

Create a KiboConfiguration instance.
This object is meant to re-used for the creation of all micro-service Api Clients.

#### Building Configuration

```java

import com.kibocommerce.sdk.common.ApiCredentials;
import com.kibocommerce.sdk.common.KiboConfiguration;

//...
public KiboConfiguration getConfiguration() {
    return KiboConfiguration.builder()
                .withTenantId(12345)
                .withSiteId(12345)
                .withCredentials(
                        ApiCredentials.builder().setClientId("client_id")
                                .setClientSecret("client_secret").build())
                .withTenantHost("t39368.sandbox.mozu.com")
                .withHomeHost("home.mozu.com")
                .build();
}
```

#### Configuration From System Properties

```java
import io.github.cdimascio.dotenv.Dotenv;
import com.kibocommerce.sdk.common.KiboConfiguration;

public KiboConfiguration getConfiguration() {
    // using dotenv to load .env file into system properties
    Dotenv dotenv = Dotenv
        .configure()
        .systemProperties()
        .load();
    // initialize configuration object from system properties
    KiboConfiguration configuration = KiboConfiguration.builder()
                .fromSystemProperties()
                .build();
    return configuration
}
```

#### Environment Template

```bash
KIBO_TENANT=
KIBO_SITE=
KIBO_CLIENT_ID=
KIBO_CLIENT_SECRET=
KIBO_CATALOG=
KIBO_MASTER_CATALOG=
KIBO_LOCALE=
KIBO_CURRENCY=
KIBO_HOME_HOST=
KIBO_TENANT_HOST=
KIBO_PCI_HOST=
KIBO_DEBUG_CLIENT=
```

### Creating an API Client

```java
// Import Kibo Configuration
import com.kibocommerce.sdk.common.ApiCredentials;
import com.kibocommerce.sdk.common.KiboConfiguration;
// Import Kibo Commerce Catalog Administration API
import com.kibocommerce.sdk.catalogadministration.api.ProductsApi;
// Import the Kibo Commerce Catalog Administration Models
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProduct;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        // Get Kibo Configuration Reference
        KiboConfiguration configuration = getConfiguration();
        // Build API Instance
        ProductsApi api = ProductsApi.builder().withConfig(configuration).build();
        // Make API call to Catalog Administration service to get product
        CatalogAdminsProduct product = api.getProduct(productCode);

    }
}
```
