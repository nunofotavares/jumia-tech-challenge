import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
    name: 'arrayFilter'
})

export class BuilderFilterPipe implements PipeTransform {

    transform(value: any[], searchString: string) {

       if (!searchString) {
         console.log('no search');
         return value;
       }

       return value.filter(it => {
           const country = it.country.toString().includes(searchString);
           const state = it.state.toLowerCase().includes(searchString.toLowerCase());
           return (country + state);
       });
    }
}