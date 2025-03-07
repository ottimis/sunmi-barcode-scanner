export enum CodeType {
  EAN_8 = 'EAN_8',
  UPC_E = 'UPC_E',
  ISBN_10 = 'ISBN_10',
  CODE_11 = 'CODE_11',
  UPC_A = 'UPC_A',
  EAN_13 = 'EAN_13',
  ISBN_13 = 'ISBN_13',
  INTERLEAVED_2_OF_5 = 'INTERLEAVED_2_OF_5',
  CODE_128 = 'CODE_128',
  CODABAR = 'CODABAR',
  CODE_39 = 'CODE_39',
  CODE_93 = 'CODE_93',
  DATABAR = 'DATABAR',
  DATABAR_EXP = 'DATABAR_EXP',
  Micro_PDF_417 = 'Micro_PDF_417',
  Micro_QR = 'Micro_QR',
  QR_CODE = 'QR_CODE',
  PDF417 = 'PDF417',
  DATA_MATRIX = 'DATA_MATRIX',
  AZTEC = 'AZTEC',
  Hanxin = 'Hanxin',
}

export interface ScanOptions {
  playSound?: boolean;
  playVibrate?: boolean;
  identifyMoreCode?: boolean;
  showSettings?: boolean;
  showAlbum?: boolean;
  identifyInverse?: boolean;
  codeTypes?: CodeType[];
}

export interface SunmiBarcodePlugin {
  hasScanner(): Promise<{ value: boolean }>;
  scan(options: ScanOptions): Promise<{ value: string, type: string }>;
}
