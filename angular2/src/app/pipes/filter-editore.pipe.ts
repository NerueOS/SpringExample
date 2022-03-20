import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filterEditore'
})
export class FilterEditorePipe implements PipeTransform {

  transform(value: any, filterString: any): any {
    if (filterString == null) {
      return value;
    }

    return value.filter(function (filterEditore: any) {
      return filterEditore.editore.toLowerCase().indexOf(filterString.toLowerCase()) > -1;
    })
  }

}
