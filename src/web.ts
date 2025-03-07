import { WebPlugin } from '@capacitor/core';

import type {ScanOptions, SunmiBarcodePlugin} from './definitions';

export class SunmiBarcodeWeb extends WebPlugin implements SunmiBarcodePlugin {
  async hasScanner(): Promise<{ value: boolean }> {
      return { value: false };
  }

  async scan(options: ScanOptions): Promise<{ value: string, type: string }> {
    options;
    return { value: '', type: '' };
  }
}
