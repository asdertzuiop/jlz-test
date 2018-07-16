import {Component, Input} from '@angular/core';
import {TweetModel} from "../../../models/tweet.model";
import {ActivatedRoute, Params} from "@angular/router";
import {TweetService} from "../../../services/tweet/tweet.service";


@Component({
  selector: 'app-user-details-view',
  templateUrl: './user-details-view.component.html',
  styleUrls: ['./user-details-view.component.css']
})
export class UserDetailsViewComponent{

    @Input() tweets: TweetModel[]; 
   
  
}
