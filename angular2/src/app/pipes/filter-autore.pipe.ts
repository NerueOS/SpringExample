import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filterAutore'
})
export class FilterAutorePipe implements PipeTransform {

  transform(value: any, filterString: any): any {
    if (filterString == null) {
      return value;
    }

    return value.filter(function (filterAutore: any) {
      return filterAutore.autore.toLowerCase().indexOf(filterString.toLowerCase()) > -1;
    })
  }

}
