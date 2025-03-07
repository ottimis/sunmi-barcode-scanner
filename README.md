# sunmi-barcode-scanner

Plugin to use SunMI barcode scanner with Ionic App

## Install

```bash
npm install sunmi-barcode-scanner
npx cap sync
```

## API

<docgen-index>

* [`hasScanner()`](#hasscanner)
* [`scan(...)`](#scan)
* [Interfaces](#interfaces)
* [Enums](#enums)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### hasScanner()

```typescript
hasScanner() => Promise<{ value: boolean; }>
```

**Returns:** <code>Promise&lt;{ value: boolean; }&gt;</code>

--------------------


### scan(...)

```typescript
scan(options: ScanOptions) => Promise<{ value: string; type: string; }>
```

| Param         | Type                                                |
| ------------- | --------------------------------------------------- |
| **`options`** | <code><a href="#scanoptions">ScanOptions</a></code> |

**Returns:** <code>Promise&lt;{ value: string; type: string; }&gt;</code>

--------------------


### Interfaces


#### ScanOptions

| Prop                   | Type                    |
| ---------------------- | ----------------------- |
| **`playSound`**        | <code>boolean</code>    |
| **`playVibrate`**      | <code>boolean</code>    |
| **`identifyMoreCode`** | <code>boolean</code>    |
| **`showSettings`**     | <code>boolean</code>    |
| **`showAlbum`**        | <code>boolean</code>    |
| **`identifyInverse`**  | <code>boolean</code>    |
| **`codeTypes`**        | <code>CodeType[]</code> |


### Enums


#### CodeType

| Members                  | Value                             |
| ------------------------ | --------------------------------- |
| **`EAN_8`**              | <code>'EAN_8'</code>              |
| **`UPC_E`**              | <code>'UPC_E'</code>              |
| **`ISBN_10`**            | <code>'ISBN_10'</code>            |
| **`CODE_11`**            | <code>'CODE_11'</code>            |
| **`UPC_A`**              | <code>'UPC_A'</code>              |
| **`EAN_13`**             | <code>'EAN_13'</code>             |
| **`ISBN_13`**            | <code>'ISBN_13'</code>            |
| **`INTERLEAVED_2_OF_5`** | <code>'INTERLEAVED_2_OF_5'</code> |
| **`CODE_128`**           | <code>'CODE_128'</code>           |
| **`CODABAR`**            | <code>'CODABAR'</code>            |
| **`CODE_39`**            | <code>'CODE_39'</code>            |
| **`CODE_93`**            | <code>'CODE_93'</code>            |
| **`DATABAR`**            | <code>'DATABAR'</code>            |
| **`DATABAR_EXP`**        | <code>'DATABAR_EXP'</code>        |
| **`Micro_PDF_417`**      | <code>'Micro_PDF_417'</code>      |
| **`Micro_QR`**           | <code>'Micro_QR'</code>           |
| **`QR_CODE`**            | <code>'QR_CODE'</code>            |
| **`PDF417`**             | <code>'PDF417'</code>             |
| **`DATA_MATRIX`**        | <code>'DATA_MATRIX'</code>        |
| **`AZTEC`**              | <code>'AZTEC'</code>              |
| **`Hanxin`**             | <code>'Hanxin'</code>             |

</docgen-api>
