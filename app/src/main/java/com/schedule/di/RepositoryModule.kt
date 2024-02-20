import com.schedule.data.remote.dtos.PairDto
import com.schedule.data.remote.dtos.SquadDto
import com.schedule.data.remote.dtos.SubjectDto
import com.schedule.data.remote.dtos.TeacherDto
import com.schedule.data.remote.dtos.UserDto
import com.schedule.data.remote.dtos.date.SemesterDto
import com.schedule.data.remote.dtos.date.WeekDto
import com.schedule.data.remote.dtos.room.AudienceDto
import com.schedule.data.remote.dtos.room.AudienceTypeDto
import com.schedule.data.repositories.Repository
import com.schedule.domain.repository.IRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<IRepository<TeacherDto>> { Repository(get()) }
    single<IRepository<SubjectDto>> { Repository(get()) }
    single<IRepository<SquadDto>> { Repository(get()) }
    single<IRepository<AudienceTypeDto>> { Repository(get()) }
    single<IRepository<AudienceDto>> { Repository(get()) }
    single<IRepository<SemesterDto>> { Repository(get()) }
    single<IRepository<WeekDto>> { Repository(get()) }
    single<IRepository<PairDto>> { Repository(get()) }
    single<IRepository<UserDto>> { Repository(get()) }
}