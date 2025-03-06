import { registerPlugin } from '@capacitor/core';

import type { SunmiBarcodePlugin } from './definitions';

const SunmiBarcode = registerPlugin<SunmiBarcodePlugin>('SunmiBarcode', {
  web: () => import('./web').then((m) => new m.SunmiBarcodeWeb()),
});

export * from './definitions';
export { SunmiBarcode };
