import { WebPlugin } from '@capacitor/core';

import type { SunmiBarcodePlugin } from './definitions';

export class SunmiBarcodeWeb extends WebPlugin implements SunmiBarcodePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
