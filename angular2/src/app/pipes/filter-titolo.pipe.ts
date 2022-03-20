import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filterTitolo'
})
export class FilterTitoloPipe implements PipeTransform {

  transform(value: any, filterString: any): any {
    if (filterString == null) {
      return value;
    }

    return value.filter(function (filterTitolo: any) {
      return filterTitolo.titolo.toLowerCase().indexOf(filterString.toLowerCase()) > -1;
    })
  }


}
